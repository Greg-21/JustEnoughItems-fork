package mezz.jei.gui.config;

import mezz.jei.api.runtime.IIngredientManager;
import mezz.jei.gui.bookmarks.BookmarkList;
import mezz.jei.gui.bookmarks.IBookmark;

import java.util.List;

public interface IBookmarkConfig {
	void saveBookmarks(IIngredientManager ingredientManager, List<IBookmark> list);

	void loadBookmarks(IIngredientManager ingredientManager, BookmarkList bookmarkList);
}
