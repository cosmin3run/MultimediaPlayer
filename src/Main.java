import en.player.childClass.Audio;
import en.player.childClass.Image;
import en.player.childClass.Video;
import en.player.superClass.MediaElements;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MediaElements[] player = new MediaElements[2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < player.length; i++) {
            System.out.println("Please insert media type (Audio, Image, Video)");
            String type = scanner.nextLine();

            switch (type.trim().toLowerCase()) {
                case "audio":
                    System.out.println("Enter audio title: ");
                    String audioTitle = scanner.nextLine();
                    System.out.println("Enter audio length");
                    int audioLength = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Set volume between 1 and 5");
                    int audioVolume = scanner.nextInt();
                    scanner.nextLine();
                    player[i] = new Audio(audioTitle, audioLength, audioVolume);
                    break;
                case "video":
                    System.out.println("Enter video title: ");
                    String videoTitle = scanner.nextLine();
                    System.out.println("Enter video length: ");
                    int videoDuration = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Set volume between 1 and 5: ");
                    int videoVolume = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Set brightness between 1 and 5: ");
                    int videoBrightness = scanner.nextInt();
                    scanner.nextLine();
                    player[i] = new Video(videoTitle, videoDuration, videoVolume, videoBrightness);
                    break;
                case "image":
                    System.out.println("Choose a title: ");
                    String imageTitle = scanner.nextLine();
                    System.out.println("Set brightness(from 1 to 5): ");
                    int imageBrightness = scanner.nextInt();
                    scanner.nextLine();
                    player[i] = new Image(imageTitle, imageBrightness);
                    break;
                default:
                    System.out.println("Invalid type. Try again.");
                    i--;
                    break;
            }
        }
        while (true) {
            System.out.println("Play media number: (from 1 to 5, or 0 to exit)");
            Integer choice = scanner.nextInt();
            scanner.nextLine();
            if (choice.equals(0)) {
                System.out.println("Player turned off");
                scanner.close();
                break;
            } else if (player[choice - 1] instanceof Image) {
                ((Image) player[choice - 1]).show();
                System.out.println("Change brightness by typing Y. (N to keep it unchanged)");
                String resp = scanner.nextLine();
                if (resp.equals("y")) {
                    label:
                    while (true) {
                        System.out.println("Type 'down' to lower volume or 'up' to turn the volume up ('q' to go exit volume settings)");
                        String setBrightness = scanner.nextLine();
                        switch (setBrightness) {
                            case "down":
                                ((Image) player[choice - 1]).brightnessDown();
                                ((Image) player[choice - 1]).show();
                                break;
                            case "up":
                                ((Image) player[choice - 1]).brightnessUp();
                                ((Image) player[choice - 1]).show();
                                break;
                            case "q":
                                break label;
                            default:
                                System.out.println("Only the following inputs are allowed: 'down' 'up' 'q'.");
                                break;
                        }
                    }
                } else if (resp.equals("n")) {
                } else {
                    System.out.println("Only the following inputs are allowed: 'y' 'n'");
                    break;
                }
            } else if (player[choice - 1] instanceof Audio) {
                ((Audio) player[choice - 1]).play();
                System.out.println("Type 'y' to set volume ('n' to skip)");
                String respVol = scanner.nextLine();
                if (respVol.equals("y")) {
                    label:
                    while (true) {
                        System.out.println("Type 'down' to lower volume/Type 'up' to increase volume ('q' to quit volume settings)");
                        String setVolume = scanner.nextLine();
                        switch (setVolume) {
                            case "down":
                                ((Audio) player[choice - 1]).volumeDown();
                                ((Audio) player[choice - 1]).play();
                                break;
                            case "up":
                                ((Audio) player[choice - 1]).volumeUp();
                                ((Audio) player[choice - 1]).play();
                                break;
                            case "q":
                                break label;
                            default:
                                System.out.println("Only the following inputs are allowed: 'down' 'up' 'q'");
                                break;
                        }
                    }
                } else if (respVol.equals("n")) {
                } else {
                    System.out.println("Only the following inputs are allowed: 'y' 'n'");
                    break;
                }
            } else if (player[choice - 1] instanceof Video) {
                ((Video) player[choice - 1]).play();
                System.out.println("Type 'y' to set brightness ('n' to skip)");
                String respBr = scanner.nextLine();
                if (respBr.equals("y")) {
                    label:
                    while (true) {
                        System.out.println("Type 'down' to lower brightness/Type 'up' to increase brightness ('q' to quit volume settings)");
                        String setBrightness = scanner.nextLine();
                        switch (setBrightness) {
                            case "down":
                                ((Video) player[choice - 1]).brightnessDown();
                                ((Video) player[choice - 1]).play();
                                break;
                            case "up":
                                ((Video) player[choice - 1]).brightnessUp();
                                ((Video) player[choice - 1]).play();
                                break;
                            case "q":
                                break label;
                            default:
                                System.out.println("Only the following inputs are allowed: 'down' 'up' 'q'");
                                break;
                        }
                    }
                } else if (respBr.equals("n")) {
                } else {
                    System.out.println("Only the following inputs are allowed: 'y' 'n'");
                    break;
                }
                System.out.println("Type 'y' to set volume ('n' to skip)");
                String respVol = scanner.nextLine();
                if (respVol.equals("y")) {
                    label:
                    while (true) {
                        System.out.println("Type 'down' to lower volume/Type 'up' to increase volume ('q' to quit volume settings)");
                        String setVolume = scanner.nextLine();
                        switch (setVolume) {
                            case "down":
                                ((Video) player[choice - 1]).volumeDown();
                                ((Video) player[choice - 1]).play();
                                break;
                            case "up":
                                ((Video) player[choice - 1]).volumeUp();
                                ((Video) player[choice - 1]).play();
                                break;
                            case "q":
                                break label;
                            default:
                                System.out.println("Only the following inputs are allowed: 'down' 'up' 'q'");
                                break;
                        }
                    }
                } else if (respVol.equals("n")) {

                } else {
                    System.out.println("Only the following inputs are allowed: 'y' 'n'");

                }
            }
            /*else {
                System.out.println("There are only " + player[choice] + "elements");
                break;
            }*/
        }
    }
}


