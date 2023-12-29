package com.core.design.pattern.behavioural.iterator.enum_iterator;

public enum ThemeColor {
    RED,
    ORANGE,
    WHITE,
    BLUE,
    BROWN;

    public static Iterator<ThemeColor> getIterator() {
        return new ThemeColorIterator();
    }

    private static class ThemeColorIterator implements Iterator<ThemeColor> {

        private int position;


        @Override
        public boolean hasNext() {
            return position < ThemeColor.values().length;
        }

        @Override
        public ThemeColor next() {
            return ThemeColor.values()[position++];
        }
    }
}
