package dto;

/**
 * Created by xmfy on 2018/1/27.
 */
public class BookSuggestion {
    private String type;
    private String value;

    public BookSuggestion(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BookSuggestion{" +
                "type=" + type +
                ", value='" + value + '\'' +
                '}';
    }
}
