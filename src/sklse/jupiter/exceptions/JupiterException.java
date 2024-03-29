/*
 *    Copyright 2009-2012 The MyBatis Team
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package sklse.jupiter.exceptions;

public class JupiterException extends RuntimeException {

  private static final long serialVersionUID = 3880206998166270511L;

  public JupiterException() {
    super();
  }

  public JupiterException(String message) {
    super(message);
  }

  public JupiterException(String message, Throwable cause) {
    super(message, cause);
  }

  public JupiterException(Throwable cause) {
    super(cause);
  }

}
