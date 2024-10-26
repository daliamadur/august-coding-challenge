   void saveImage(BufferedImage image, String format, String outputPath) {
        try{
            ImageIO.write(image, format, new File(outputPath));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
