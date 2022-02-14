import java.util.ArrayList;

import org.apache.wicket.model.Model;
import org.apache.wicket.model.util.ListModel;

public class HomePage {

    private final Model<String> name;
    private final Model<String> level;
    private final Model<String> type;
    private final Model<Boolean> admin;
    private final ListModel<String> options;

    public HomePage() {
        this.name = new Model<String>();
        this.level = new Model<String>();
        this.type = new Model<String>();
        this.admin = new Model<Boolean>();
        this.options = new ListModel<String>();
        this.options.setObject(new ArrayList<String>());
    }

    public static void main(String[] args) {
        HomePage home = new HomePage();
        home.name.setObject("Taro");
        home.level.setObject("1級");
        home.type.setObject("社員");
        home.admin.setObject(true);
        home.options.getObject().add("開発");
        home.options.getObject().add("保守");
        home.regist();
    }

    private void regist() {
        System.out.println("name:" + name.getObject());
        System.out.println("level:" + level.getObject());
        System.out.println("type:" + type.getObject());
        System.out.println("admin:" + admin.getObject());
        for (String op: options.getObject()) {
            System.out.println("op:" + op);
        }
    }
}
