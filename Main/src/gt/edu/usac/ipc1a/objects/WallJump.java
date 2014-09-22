package gt.edu.usac.ipc1a.objects;

import java.awt.Color;
import java.awt.Graphics;

public class WallJump extends Circle{
	int positionX = 0;
	int positionY = 0;
	int velocityX = 1;
	int velocityY = 1;

	public WallJump()
	{
		size = 100;
		
	}
	
	public void DetectarSuelo()
	{
			if( positionX+size > 800)
			{
			
			System.out.println("Detecte Muro");
			velocityX = -1;
			AplicarGravedad();
			}
		if (positionX+size < 0)
		{
			System.out.println("Detecte Muro");
			velocityX = 1;
			AplicarGravedad();
			}
     }

		
	
		public void AplicarGravedad()
	        {
                positionX += velocityX ;
			}
		
		public void Draw (Graphics g){	
		g.setColor(Color.yellow);
        g.fillOval(positionX,100,size,size);
		}

}
