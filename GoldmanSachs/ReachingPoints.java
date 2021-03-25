package GoldmanSachs;

public class ReachingPoints {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while (sx < tx && sy < ty)
            if (tx < ty)
                ty %= tx;
            else
                tx %= ty;

        return (sy == ty && sx <= tx && (tx - sx) % sy == 0) || (sx == tx && sy <= ty && (ty - sy) % sx == 0);
    }
}
