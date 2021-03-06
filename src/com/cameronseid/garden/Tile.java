package com.cameronseid.garden;

/**
 * Generic tile object. Any blank tiles will be this object
 */
public class Tile {

    int hydration; // How hydrated the tile is currently. Decreases by 1 every turn, the plant "dies" if it hits 0.
    int growth; // Increased by 1 every turn. When the plant reaches 5, it is fully grown and ready to be harvested.
    String symbol; // The symbol displayed on the map
    String materialName; // The name shown with the "check" command
    int[] coordinates; // the x/y coordinates of the plant

    /**
     * Constructor method. Sets all properties to 0 since this is a basic tile
     *
     * @param coordinates X and Y coordinates of the tile in the world
     */
    public Tile(int[] coordinates) {
        this.hydration = 0;
        this.growth = 0;
        this.symbol = "O";
        this.materialName = "Empty Dirt"; // this is an empty tile
        this.coordinates = coordinates;
    }

    /**
     * Water this tile
     */
    public void waterPlant() {
        this.hydration = 8;
    }

    /**
     * Returns a string to be printed to the user which contains all relevant info about the tile.
     *
     * @return The string to be printed to the user containing info about the tile
     */
    public String getInfo() {
        return materialName + "\nYou can plant something here!";
    }

    /**
     * Returns the symbol for printing to the garden view
     *
     * @return The single-character
     */
    public String getSymbol() {
        return this.symbol;
    }

    /**
     * Method called every turn - does nothing for empty tiles
     *
     * @return Always returns true
     */
    public boolean progressTurn() {
        // do nothing, this isn't a plant
        return true;
    }

    /**
     * Updates the tile's identifiers with the given symbol and name
     *
     * @param symbol       The symbol displayed on the garden grid
     * @param materialName The name of the material shown in the "Check" command
     */
    public void setInfo(String symbol, String materialName) {
        this.symbol = symbol;
        this.materialName = materialName;
    }

}
