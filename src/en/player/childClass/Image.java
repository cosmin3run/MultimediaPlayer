package en.player.childClass;

import en.player.interfaces.Brightness;
import en.player.superClass.MediaElements;

public class Image extends MediaElements implements Brightness {
    private int brightness;

    public Image(String title, int brightness) {
        super(title);
        this.brightness = brightness;
    }

    @Override
    public void brightnessUp() {
        if (brightness < 5) {
            brightness++;
        }

    }

    @Override
    public void brightnessDown() {
        if (brightness > 0) {
            brightness--;
        }
    }

    public void show() {
        System.out.println(title + " image is displaying at a brightness of " + "*".repeat(brightness));
    }
}
