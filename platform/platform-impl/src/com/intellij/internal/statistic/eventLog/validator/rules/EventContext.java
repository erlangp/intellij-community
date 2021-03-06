// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.internal.statistic.eventLog.validator.rules;

import com.intellij.util.containers.ContainerUtil;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class EventContext {
   public final String eventId;
   public final Map<String, Object>  eventData;

  private EventContext(@NotNull String eventId, @NotNull Map<String, Object> eventData) {
    this.eventId = eventId;
    this.eventData = ContainerUtil.unmodifiableOrEmptyMap(eventData);
  }

  public static EventContext create(@NotNull  String eventId, @NotNull  Map<String, Object>  eventData) {
     return new EventContext(eventId, eventData);
  }
}
