package com.yjy.user.utils;

import android.text.TextUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class StringQueue
{
  public int length;
  public Queue<String> queue = new LinkedList();
  public String topString;

  public StringQueue(int paramInt)
  {
    this.length = paramInt;
  }

  public void offer(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    do
    {
      do
      {return;}
      while (paramString.equals(this.topString));

//      this.queue.offer(paramString);
//      this.topString = paramString;
    }
    while (this.queue.size() <= this.length);
//    this.queue.poll();
  }

  public String toString()
  {
    if ((this.queue == null) || (this.queue.size() == 0))
      return "empty";
    StringBuilder localStringBuilder = new StringBuilder();
    ArrayList localArrayList = new ArrayList(this.queue);
    if ((localArrayList != null) && (localArrayList.size() > 0))
    {
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
        localStringBuilder.append((String)localIterator.next()).append("-");
    }
    return localStringBuilder.toString();
  }
}