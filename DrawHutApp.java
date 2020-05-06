import java.awt.*;
import java.applet.*;
public class DrawHutApp extends Applet
{
/*
<applet code="DrawHutApp.class" width=400 height=450></applet>
*/
public void paint(Graphics gp)
{ int [] x = {150, 300, 225};
int [] y = {150, 150, 25};
gp.drawRect(150, 150, 150, 200); //House
gp.drawRect(200, 200, 50, 150); // Door
gp.drawOval(200, 75, 50, 50); // Skylight
gp.drawPolygon(x, y, 3); // Roof
}
}
