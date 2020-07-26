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

public class ItemMetaData {

  private boolean isExpanded = false;
  private boolean isSelected = false;

  public boolean isExpanded() {
    return isExpanded;
  }

  public boolean isSelected() {
    return isSelected;
  }

  public void setExpanded(boolean expanded) {
    isExpanded = expanded;
  }

  public void setSelected(boolean selected) {
    isSelected = selected;
  }
}
