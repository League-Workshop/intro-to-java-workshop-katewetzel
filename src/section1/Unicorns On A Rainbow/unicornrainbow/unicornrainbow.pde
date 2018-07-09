PImage rainbow;
PImage unicorn;
void setup(){
  rainbow=loadImage("rainbow.png");
  size(318,159);
  rainbow.resize(318,159);
  background(rainbow);
  unicorn=loadImage("unicorn.jpg");
  unicorn.resize(100,100);
}
void draw(){
  background(rainbow);
  image(unicorn,mouseX,mouseY);
}