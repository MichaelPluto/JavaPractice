package com.yzf.mhl.domain;

/**
 * 是个javabean与 menu对应
 */
public class Menu {
    private Integer menuId;
    private String menuName;
    private String menuClass;
    private Double menuPrice;

    public Menu() {
    }

    public Menu(Integer menuId, String menuName, String menuClass, Double menuPrice) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.menuClass = menuClass;
        this.menuPrice = menuPrice;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuClass() {
        return menuClass;
    }

    public void setMenuClass(String menuClass) {
        this.menuClass = menuClass;
    }

    public Double getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(Double menuPrice) {
        this.menuPrice = menuPrice;
    }

    @Override
    public String toString() {
        return menuId + "\t\t\t" + menuName + "\t\t" + menuClass + "\t\t" + menuPrice;
    }
}
