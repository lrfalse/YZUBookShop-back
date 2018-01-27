package web;

import dto.Book;
import dto.BookSuggestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.BuyService;
import tool.FormedData;

import java.util.List;

/**
 * Created by xmfy on 2018/1/27.
 */
@RequestMapping("/buy")
@Controller
public class BuyController {

    @Autowired
    private BuyService buyService;

    @RequestMapping(value = "/bookSuggestion", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public FormedData<List<BookSuggestion>> addSelling(@RequestParam("value") String value, @RequestParam("size") int size, @RequestParam("category1") Integer c1, @RequestParam("category2") Integer c2){
        return buyService.getBookSuggestion(value, size, c1, c2);
    }

    @RequestMapping(value = "/searchByType", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public FormedData<List<Book>> searchBooksByType(@RequestParam("type") String type, @RequestParam("value") String value){
        if (type.length()==0)
            return buyService.queryBookFuzzy(value, 20, 0, 0);
        return buyService.getBooksByType(type, value);
    }

    @RequestMapping(value = "/fuzzyQuery", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public FormedData<List<Book>> queryBookFuzzy(@RequestParam("text") String text, @RequestParam("size") int size, @RequestParam("category1") Integer c1, @RequestParam("category2") Integer c2){
        System.out.println(text + size + c1 + c2);
        return buyService.queryBookFuzzy(text, size, c1, c2);
    }
}
