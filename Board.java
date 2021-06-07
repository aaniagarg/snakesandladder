// Aania Garg
// Samitha Nadella
// AP Computer Science A
// June 7, 2021

package snakesandladders;

public class Board extends JPanel{
    public static final int LENGTH = 10;
    private final Color[] COLOR_ARRAY = {Color.decode("#FFFACD"), Color.decode("#593E1A")};

    public Board()   {
        //grid layout 6x6
        setLayout(new GridLayout(LENGTH, LENGTH));
        int numView = 1;

        for (int i = 0; i < LENGTH; i++)
        {
            numView = (numView == 0) ? 1:0;
            for (int j = 0; j < LENGTH; j++)
            {
                add(new TileView(COLOR_ARRAY[numView]));
                numView = (numView == 0) ? 1:0;
            }
        }
    }
}
