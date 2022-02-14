package sow.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

import sow.HomePage;

public class Menu extends WebPage {

    private static final long serialVersionUID = 1L;

    @Override
    protected void onInitialize() {
        super.onInitialize();

        add(new BookmarkablePageLink<Void>("home", HomePage.class));
        add(new BookmarkablePageLink<Void>("mini", MiniPage.class));
    }

}
