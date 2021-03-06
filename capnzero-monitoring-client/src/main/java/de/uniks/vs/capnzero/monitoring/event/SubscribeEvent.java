package de.uniks.vs.capnzero.monitoring.event;

public class SubscribeEvent extends DebugEvent
{
  private final String type;

  public SubscribeEvent(String id)
  {
    this.id = id;
    this.type = "subscribe";
  }

  public String getType()
  {
    return type;
  }

  @Override
  public String toString()
  {
    return String.format("{\n"
                         + "  \"id\":\"%s\",\n"
                         + "  \"type\": \"%s\"\n"
                         + "}", id, type);
  }
}
