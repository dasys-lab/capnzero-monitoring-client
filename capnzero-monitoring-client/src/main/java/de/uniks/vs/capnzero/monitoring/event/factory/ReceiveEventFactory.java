package de.uniks.vs.capnzero.monitoring.event.factory;

import de.uniks.vs.capnzero.monitoring.event.ReceiveEvent;

import java.util.Map;

public class ReceiveEventFactory implements DebugEventFactory
{
  public ReceiveEventFactory(){}

  @Override
  public ReceiveEvent buildFromString( Map<String, Object> serializedEvent )
  {
    return new ReceiveEvent((String) serializedEvent.get("message"));
  }
}
