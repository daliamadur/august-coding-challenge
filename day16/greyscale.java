    BufferedImage greyscale(BufferedImage original) {
        BufferedImage grey = new BufferedImage(original.getWidth(), original.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
        Graphics2D graphics = grey.createGraphics();
        graphics.drawImage(original, 0, 0, null);
        graphics.dispose();
        return grey;
    }
