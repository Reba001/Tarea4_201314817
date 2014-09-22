package gt.edu.usac.ipc1a.objects;
import java.awt.Color;
import java.awt.Graphics;
public class BouncyCircle extends Circle{
	Color color;
	public BouncyCircle(){
		size = 100;
		gravity = 0.5f;
		color = Color.RED;
		}
	public void DetectarSuelo()
	{
		if(positionX+size > 800)
		{
			Saltar();
			CambiarColor();
			System.out.println(positionX + size);
			}
		}
	public void Saltar(){
		velocityX = 0.1f;
		}
	public void CambiarColor()
	{
		color = Color.blue;
		}
	@Override
	public void Draw (Graphics g){	
		g.setColor(color);
		g.fillOval(positionX,positionY,size,size);
		}
	}