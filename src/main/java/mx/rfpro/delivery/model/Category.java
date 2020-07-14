package mx.rfpro.delivery.model;

public class Category {

    private String title;
    private int count;
    private String imageUrl;
    
    public Category() {
    }

    public Category(String title, int count, String imageUrl) {
        this.title = title;
        this.count = count;
        this.imageUrl = imageUrl;
    }
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}