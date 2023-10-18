import greenfoot.*;
     
public class Radio extends Actor implements InterfaceElektronik,InterfaceChannelRadio{
    private boolean mesin;
    private int volume;
    
    public Radio() {
        mesin = false;
        volume = 0;
    }
    
    public void on() {
        mesin = true;
    }
    
    public void off() {
        mesin = false;
    }
    
    public void gantiChannel(int c) {
        // Penjabaran penggantian channel pada radio
    }
    
    public void perbesarVolume() {
        // Penjabaran peningkatan volume pada radio
    }
    
    public void perkecilVolume() {
        // Penjabaran penurunan volume pada radio
    }
    
    public void act() {
        // Penjabaran perilaku aktor Radio di setiap siklus aksi
    }
  }
