package project.irfananda.navdraw_w_slidetab.object;


public class Film {

    private int img;
    private String title;
    private String category;
    private double price;
    private boolean ordered;

    public Film(String category, int img, String title, double price, boolean ordered) {
        this.category = category;
        this.img = img;
        this.title = title;
        this.price = price;
        this.ordered = ordered;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isOrdered() {
        return ordered;
    }

    public void setOrdered(boolean ordered) {
        this.ordered = ordered;
    }
}
