/*
 *  Copyright (c) 2012 Malhar, Inc.
 *  All Rights Reserved.
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.malhartech.stram;

import java.util.List;
import java.util.Map;

/**
 * Definition of stream connecting 2 nodes either inline or via buffer server.
 * StramChild to use this to wire the nodes after instantiating them.
 * @author thomas
 */
public class StreamPConf extends StreamingNodeUmbilicalProtocol.WritableAdapter
{

  private static final long serialVersionUID = 1L;
  /**
   * Stream identifier from topology.
   */
  private String id;

  public String getId()
  {
    return id;
  }

  public void setId(String id)
  {
    this.id = id;
  }
  /**
   * dnode sequence of upstream node, used for inline stream to locate local
   * node, otherwise to subscribe to buffer server.
   */
  private String sourceNodeId;

  public String getSourceNodeId()
  {
    return sourceNodeId;
  }

  public void setSourceNodeId(String sourceNodeId)
  {
    this.sourceNodeId = sourceNodeId;
  }
  /**
   * dnode sequence of downstream node, used for inline stream to locate local
   * node, otherwise for buffer server publish the logicalTargetNodeId ("type")
   * will be used
   */
  private String targetNodeId;

  public String getTargetNodeId()
  {
    return targetNodeId;
  }

  public void setTargetNodeId(String targetNodeId)
  {
    this.targetNodeId = targetNodeId;
  }
  /**
   * upstream node name from topology. Required for subscribe to buffer server.
   */
  private String bufferServerChannelType;

  public String getBufferServerChannelType()
  {
    return bufferServerChannelType;
  }

  public void setBufferServerChannelType(String bufferServerChannelType)
  {
    this.bufferServerChannelType = bufferServerChannelType;
  }
  private boolean isInline;

  public boolean isInline()
  {
    return isInline;
  }

  public void setInline(boolean isInline)
  {
    this.isInline = isInline;
  }
  private String bufferServerHost;

  public String getBufferServerHost()
  {
    return bufferServerHost;
  }

  public void setBufferServerHost(String bufferServerHost)
  {
    this.bufferServerHost = bufferServerHost;
  }
  private int bufferServerPort;

  public int getBufferServerPort()
  {
    return bufferServerPort;
  }

  public void setBufferServerPort(int bufferServerPort)
  {
    this.bufferServerPort = bufferServerPort;
  }
  
  private Map<String, String> properties;

  public Map<String, String> getProperties()
  {
    return properties;
  }

  public void setProperties(Map<String, String> properties)
  {
    this.properties = properties;
  }
  
  /**
   * Partition keys for dynamic partitioning. Key set is initially empty (after
   * topology initialization) and will be populated from node processing stats
   * if the node emits partitioned data. Value(s), once assigned assigned by
   * stram limit what data flows between 2 physical nodes. Once values are set,
   * node uses them subscribe to buffer server. Stram may request detailed
   * partition stats as heartbeat response, based on which it can load balance
   * (split/merge nodes) if node is elastic.
   */
  private List<byte[]> partitionKeys;

  public List<byte[]> getPartitionKeys()
  {
    return partitionKeys;
  }

  public void setPartitionKeys(List<byte[]> partitionKeys)
  {
    this.partitionKeys = partitionKeys;
  }
    
}