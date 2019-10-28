package pkgCore;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

import CircularLinkedList.CircularLinkedList;

public class Table {

	/**
	 * @author BRG
	 * @version Lab #3
	 * @since Lab #3
	 * 
	 * TableID - UUID for the table.  Makes it unique
	 */
	private UUID TableID;
	/**
	 * @author BRG
	 * @version Lab #3
	 * @since Lab #3
	 * 
	 * TableName - Name of the table
	 */
	private String TableName;
	
	/**
	 * @author BRG
	 * @version Lab #3
	 * @since Lab #3
	 */
	private CircularLinkedList<Player> TablePlayers = new CircularLinkedList<Player>();

	/**
	 * @author BRG
	 * @version Lab #3
	 * @since Lab #3
	 * 
	 * Table - Constructor
	 * 
	 * Create an instance of Table.  Set the TableID as a random UUID, set 
	 * the TableName attribute
	 * @param tableName
	 */
	public Table(String tableName) {
		TableID = UUID.randomUUID();
		TableName = tableName;
	}

	/**
	 * @author BRG
	 * @version Lab #3
	 * @since Lab #3
	 * 
	 * SetTablePlayers - set the TablePlayers ArrayList with given Players
	 * @param Players - set of Players to add to the table
	 */
	public void SetTablePlayers(ArrayList<Player> Players)
	{
		TablePlayers.clear();
		TablePlayers.addAll(Players);
	}
	
	/**
	 * @author BRG
	 * @version Lab #3
	 * @since Lab #3
	 * 
	 * AddPlayerToTable - Add a single Player to the table.
	 * @param player - Player to be added
	 */
	public void AddPlayerToTable(Player player)
	{
		TablePlayers.add(player);
	}
	
	/**
	 * @author BRG
	 * @version Lab #3
	 * @since Lab #3
	 * 
	 * RemovePlayerFromTable - Remove a single player from the Table.
	 * @param p
	 */
	public void RemovePlayerFromTable(Player p)
	{		
		TablePlayers.delete(p);
	}
	
	/**
	 * @author BRG
	 * @version Lab #3
	 * @since Lab #3
	 * 
	 * getTablePlayers - return an ArrayList of players at the table
	 * @return
	 */
	public void getPlayerButton() {
		TablePlayers.getCurrent();
	}
	public void ClearTable() {
		TablePlayers.clear();
	}
	public void AdvanceButton() {
		TablePlayers.advanceCurrent();
	}
	public ArrayList<Player> getTablePlayers() {
		ArrayList<Player> tableplayer = new ArrayList<Player>(TablePlayers.getItemsInOrder());
		return tableplayer;
	}
}
