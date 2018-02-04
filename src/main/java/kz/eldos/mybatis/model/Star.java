package kz.eldos.mybatis.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Star star = (Star) o;
        return Objects.equals(id, star.id) &&
                Objects.equals(name, star.name) &&
                Objects.equals(coorX, star.coorX) &&
                Objects.equals(coorY, star.coorY) &&
                Objects.equals(categoryId, star.categoryId) &&
                Objects.equals(discovererId, star.discovererId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, coorX, coorY, categoryId, discovererId);
    }

    @Override
    public String toString() {
        return "Star{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coorX='" + coorX + '\'' +
                ", coorY='" + coorY + '\'' +
                ", categoryId=" + categoryId +
                ", discovererId=" + discovererId +
                '}';
    }

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
