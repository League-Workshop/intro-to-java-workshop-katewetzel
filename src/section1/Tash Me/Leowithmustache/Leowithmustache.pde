PImage mustache;
PImage Leo;
void setup(){
  Leo=loadImage("Leo.jpg");
  size(196,257);
  Leo.resize(196,257);
  mustache=loadImage("mustache.png");
  mustache.resize(80,30);
}
void draw(){
  background(Leo);
  if(mousePressed){
    image(mustache,mouseX-40,mouseY-20);
  }
    }