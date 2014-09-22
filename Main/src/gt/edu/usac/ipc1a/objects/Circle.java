package gt.edu.usac.ipc1a.objects;
import java.awt.*;
import java.awt.Graphics;
public class Circle {
	public int positionX, positionY;
	public float velocityX, velocityY;
	public  int size;
	public float gravity;
	public float jumpImpulse;
	public Circle()
	{
		size = 20;
		gravity = 0.5f;
		}
	public void Update()
	{
		AplicarGravedad();
		DetectarSuelo();
		ActualizarPosicion();
		}
	public void ActualizarPosicion()
	{
		positionX = (int)velocityX;
		positionY = (int)velocityY;
		}
	public void DetectarSuelo()
	{
		if(positionX+size > 600 )
			System.out.println("Detecte Muro");
		}
	public void AplicarGravedad()
	{
		velocityX += gravity;

	}
	public void Draw (Graphics g){	
		g.setColor(Color.RED);
		g.fillOval(positionX,positionY,size,size);
		}
	}