package test;

public class Lampe
{
    private final int PUISSANCE_DEFAUT;
    
    public boolean estAllumee;
    
    /**Définie la puissance et l'état de la lampe
     * @author blancgr
     */
    public Lampe();
    {
	this.PUISSANCE_DEFAUT = 100;
	this.estAllumee = true;
    }
    
    /**Allume la lampe
     * @author blancgr
     */
    public void allumee()
    {
	this.estAllumee = true;
    }
    
   /**Eteint la lampe
    *@author blancgr 
    */
    public void éteindre() 
    {
	this.estAllumee = false;
    }
  
    
    
}
