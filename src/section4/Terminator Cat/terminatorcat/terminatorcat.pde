PImage catPic;
int x = 643;
int y = 233;
int acceleration = 5;
void setup() {
  size(907, 510);
  catPic = loadImage("cat.jpg");
  catPic.resize(907, 510);
  background(catPic);
}

void draw() {
  if (mousePressed) {
    println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
  }
  noStroke();
  ellipse(x, y, 30, 30);
  ellipse(x-140,y-5,30,30);
  fill(#CC1100);
}
void keyPressed() {
  x-=2*acceleration;
  y+=2*acceleration;
}