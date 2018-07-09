void setup(){
  size(1000,1000);
}
void draw(){
  if(mousePressed){
    fill(#2CC6B0);
  }
  else{
    fill(#2C4EC6);
  }
  ellipse(mouseX,mouseY,100,100);
}
    