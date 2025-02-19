package dummy.addon.template.modules.hud;

import dummy.addon.template.TemplateAddon;
import meteordevelopment.meteorclient.systems.hud.HudElement;
import meteordevelopment.meteorclient.systems.hud.HudElementInfo;
import meteordevelopment.meteorclient.systems.hud.HudRenderer;
import meteordevelopment.meteorclient.utils.render.color.Color;

public class HudExample extends HudElement {
    public static final HudElementInfo<HudExample> INFO = new HudElementInfo<>(TemplateAddon.HUD_GROUP, "example", "HUD element example.", HudExample::new);

    public HudExample() {
        super(INFO);
    }

    @Override
    public void render(HudRenderer renderer) {
        setSize(renderer.textWidth("Example element", true), renderer.textHeight(true));

        renderer.text("Example element", x, y, Color.WHITE, true);
    }
}
