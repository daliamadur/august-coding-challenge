    BufferedImage resize(BufferedImage original, int width, int height) {
        BufferedImage resized = new BufferedImage(width, height, original.getType());
        Graphics2D graphics2d = resized.createGraphics();
        graphics2d.drawImage(original, 0, 0, width, height, null);
        graphics2d.dispose();
        return resized;
    }
