    BufferedImage rotate(BufferedImage original, double angle) {
        int width = original.getWidth();
        int height = original.getHeight();
        BufferedImage rotated = new BufferedImage(width, height, original.getType());
        Graphics2D graphics2D = rotated.createGraphics();
        graphics2D.rotate(Math.toRadians(angle), width/2, height/2);
        graphics2D.drawImage(original, 0, 0, null);
        graphics2D.dispose();
        return rotated;
    }
