package web;

import dto.BookSearchBean;
import dto.BookSuggestion;
import dto.SearchConditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.BuyService;
import dto.FormedData;

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

    @RequestMapping(value = "/queryBooksByType", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public FormedData<List<BookSearchBean>> fuzzyQueryBooks(@RequestParam("type") String type, @RequestParam("value") String value, @RequestParam("account") String account){
        return buyService.queryBooksByType(type, value ,account);
    }

    @RequestMapping(value = "/queryBooks", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public FormedData<List<BookSearchBean>> queryBooks(@ModelAttribute("conditions")SearchConditions conditions){
        return buyService.queryBooks(conditions);
    }

    @RequestMapping(value = "/queryHotBooks", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public FormedData<List<BookSearchBean>> queryHotBooks(@RequestParam("size") int size, @RequestParam("account") String account){
        return buyService.queryHotBooks(size, account);
    }

    @RequestMapping(value = "/singleViewAdd", method = RequestMethod.GET)
    public void singleViewAdd(@RequestParam("id")int id){
        buyService.singleViewAdd(id);
    }
}
