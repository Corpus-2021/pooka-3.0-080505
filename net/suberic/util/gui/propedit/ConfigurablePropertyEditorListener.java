package net.suberic.util.gui.propedit;

/**
 * A PropertyEditorListener than can be configured from a property.
 */
public interface ConfigurablePropertyEditorListener extends PropertyEditorListener {

  public abstract void configureListener(String key, String property, String propertyBase, String editorTemplate, PropertyEditorManager manager);

}
