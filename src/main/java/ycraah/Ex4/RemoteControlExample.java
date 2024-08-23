package ycraah.Ex4;

import ycraah.Ex5.Audio;

public class RemoteControlExample {
  public static void main(String[] args) {
    RemoteControl rc;

    rc = new Television();
    rc.turnOn();
    rc.setVolume(5);

    rc.setMute(true);
    rc.setMute(false);

    rc = new Audio();
    rc.turnOn();
    rc.setVolume(5);

    rc.setMute(true);
    rc.setMute(false);
  }
}
