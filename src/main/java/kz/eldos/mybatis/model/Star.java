package kz.eldos.mybatis.model;

public class Star {
    /*
        Fields
     */
    private Integer id;
    private String name;
    private String coorX;
    private String coorY;
    private Integer categoryId;
    private Integer discovererId;

    /*
        Entity basics
     */
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCoorX() { return coorX; }
    public void setCoorX(String coorX) { this.coorX = coorX; }

    public String getCoorY() { return coorY; }
    public void setCoorY(String coorY) { this.coorY = coorY; }

    public Integer getCategoryId() { return categoryId; }
    public void setCategoryId(Integer categoryId) { this.categoryId = categoryId; }

    public Integer getDiscovererId() { return discovererId; }
    public void setDiscovererId(Integer discovererId) { this.discovererId = discovererId; }
}
