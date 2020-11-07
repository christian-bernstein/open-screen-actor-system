package de.christianbernstein.minecraft.osas;

import com.google.common.util.concurrent.AtomicDouble;
import lombok.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Christian Bernstein
 */
@AllArgsConstructor
public final class Vec2D<T extends Number> implements Comparable<Vec2D<T>> {

    @Setter
    @Getter
    private T x, y;

    @SuppressWarnings("unchecked")
    public static <V extends Number> Vec2D<V> zero(Class< ? extends V> type){
        return new Vec2D<>((V) Integer.valueOf(0), (V) Integer.valueOf(0));
    }

    @Override
    public int compareTo(@NonNull Vec2D<T> o) {
        final double d = (double)this.getX() - (double)o.getX();
        if (d < 0){
            return -1;
        }else if (d == 0){
            return 0;
        }else {
            return 1;
        }
    }

    public double flatten(int wMatrix){
        return (this.getY().doubleValue() * wMatrix) + this.getX().doubleValue();
    }

    @Builder
    public static class OrthogonalLine2D<T extends Number> {

        @Getter
        @NonNull
        private final Vec2D<T> start, end;

        @Getter
        @NonNull
        private final OrthogonalAngle angle;

        // todo complete implementation
        private Iterator<Vec2D<T>> calc(@NonNull final double delta){
            final List<Vec2D<T>> vec2Ds = new ArrayList<>();
            final AtomicDouble n = new AtomicDouble(0);
            switch (this.getAngle()) {
                case ANGLE_0, ANGLE_180:
                    while (n.get() + delta <= (double)this.getEnd().getX()){
                        final double v = n.getAndAdd(delta);
                    }
                    break;
            }
            return vec2Ds.iterator();
        }
    }
}
