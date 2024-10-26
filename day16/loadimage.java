BufferedImage loadImage(String path) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File (path));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return img;
    }
