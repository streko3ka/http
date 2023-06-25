import com.fasterxml.jackson.annotation.JsonProperty;

public class Users {
    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final String upvotes;

    public Users(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") String upvotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    @Override
    public String toString() {
        return "id=" + id +
                "\r\n text=" + text +
                "\r\n type=" + type +
                "\r\n user=" + user +
                "\r\n upvotes=" + upvotes;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getUser() {
        return user;
    }

    public String getType() {
        return type;
    }

    public String getUpvotes() {
        return upvotes;
    }
}