package mezz.jei.library.gui.recipes;

import com.mojang.blaze3d.vertex.PoseStack;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.common.gui.JeiTooltip;
import mezz.jei.common.util.ImmutableRect2i;
import net.minecraft.network.chat.Component;

public class ShapelessIcon {
	private final IDrawable icon;
	private final ImmutableRect2i area;

	public ShapelessIcon(IDrawable icon, int x, int y) {
		this.icon = icon;
		this.area = new ImmutableRect2i(x, y, icon.getWidth(), icon.getHeight());
	}

	public void draw(PoseStack poseStack) {
		icon.draw(poseStack, area.getX(), area.getY());
	}

	public boolean isMouseOver(int mouseX, int mouseY) {
		return area.contains(mouseX, mouseY);
	}

	public void addTooltip(JeiTooltip tooltip) {
		tooltip.add(Component.translatable("jei.tooltip.shapeless.recipe"));
	}
}
