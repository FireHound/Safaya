/*
 * Copyright 2017 Riyaz Ahamed
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package mva2.adapter.internal;

import mva2.adapter.Section;

public interface Notifier {

  void notifySectionItemMoved(Section section, int fromPosition, int toPosition);

  void notifySectionRangeChanged(Section section, int positionStart, int itemCount, Object payload);

  void notifySectionRangeInserted(Section section, int positionStart, int itemCount);

  void notifySectionRangeRemoved(Section section, int positionStart, int itemCount);
}
