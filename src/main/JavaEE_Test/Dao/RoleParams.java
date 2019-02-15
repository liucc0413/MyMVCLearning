package Dao;

public class RoleParams {
    private int id;
    private String name;
    private PageParams pageParams;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PageParams getPageParams() {
        return pageParams;
    }

    public void setPageParams(PageParams pageParams) {
        this.pageParams = pageParams;
    }

    @Override
    public String toString() {
        return "RoleParams{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
