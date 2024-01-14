package en.player.childClass;

import en.player.interfaces.Brightness;
import en.player.interfaces.Volume;
import en.player.superClass.MediaElements;

public class Video extends MediaElements implements Volume, Brightness {
    private int duration;
    private int volume;
    private int brightness;

    public Video(String title, int duration, int volume, int brightness) {
        super(title);
        this.duration = duration;
        this.volume = volume;
        this.brightness = brightness;

    }

    @Override
    public void brightnessUp() {
        if (brightness < 5) {
            brightness++;
        } else {
            System.out.println("Video brightness can be set maximum to 5 *");
        }

    }

    @Override
    public void brightnessDown() {
        if (brightness > 0) {
            brightness--;
        } else {
            System.out.println("You can't see me! -JC-");
        }
    }

    @Override
    public void volumeUp() {
        if (volume < 5) {
            volume++;
        } else {
            System.out.println("You already set the volume to maximum");
        }

    }

    @Override
    public void volumeDown() {
        if (volume > 0) {
            volume--;
        } else {
            System.out.println("You can't hear less than nothing. Turn up your volume.");
        }

    }

    public void play() {
        if (duration > 0) {
            for (int i = 0; i < duration; i++) {
                System.out.println("The video you're playing is called" + title + "\n" + "The volume is set to " + "!".repeat(volume) + "\n" + "The brightness is set to " + "*".repeat(brightness));
            }
        }
    }
}
