package com.amazon.ask.FindLawSkill;

import com.amazon.ask.model.interfaces.display.*;

import java.util.ArrayList;
import java.util.List;

public class Template1 {

    /**
     * Helper method to create a body template 3
     * @param title the title to be displayed on the template
     * @param primaryText the primary text to be displayed on the template
     * @param secondaryText the secondary text to be displayed on the template
     * @return Template3
     */
    public Template getBodyTemplate1(String title, String primaryText, String secondaryText, Image bImage) {
        return BodyTemplate1.builder()
                .withBackgroundImage(bImage)
                .withTitle(title)
                .withTextContent(getTextContent(primaryText, secondaryText))
                .build();
    }



    /**
     * Helper method to create the image object for display interfaces
     * @param imageUrl the url of the image
     * @return Image that is used in a body template
     */
    public Image getImage(String imageUrl) {
        List<ImageInstance> instances = getImageInstance(imageUrl);
        return Image.builder()
                .withSources(instances)
                .build();
    }

    /**
     * Helper method to create List of image instances
     * @param imageUrl the url of the image
     * @return instances that is used in the image object
     */
    public List<ImageInstance> getImageInstance(String imageUrl) {
        List<ImageInstance> instances = new ArrayList<>();
        ImageInstance instance = ImageInstance.builder()
                .withUrl(imageUrl)
                .build();
        instances.add(instance);
        return instances;
    }

    /**
     * Helper method that returns text content to be used in the body template.
     * @param primaryText
     * @param secondaryText
     * @return RichText that will be rendered with the body template
     */
    public TextContent getTextContent(String primaryText, String secondaryText) {
        return TextContent.builder()
                .withPrimaryText(makeRichText(primaryText))
                .withSecondaryText(makeRichText(secondaryText))
                .build();
    }

    /**
     * Helper method that returns the rich text that can be set as the text content for a body template.
     * @param text The string that needs to be set as the text content for the body template.
     * @return RichText that will be rendered with the body template
     */
    public RichText makeRichText(String text) {
        return RichText.builder()
                .withText(text)
                .build();
    }
}
