/* Table des utilisateurs */
CREATE TABLE utilisateur (
  utilisateur_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  avatar VARCHAR(255), /* photo de profil */
  nom VARCHAR(255), /* nom */
  statut VARCHAR(255), /* statut */
  activite VARCHAR(255), /* activité */
  etatEnligne BOOLEAN /* état en ligne de l'utilisateur */
);

/* Table des conversations (individuelles ou de groupe) */
CREATE TABLE conversation (
  conversation_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nom VARCHAR(255), /* nom du groupe ou conversation (facultatif pour individuel) */
  type ENUM('individuel', 'groupe') NOT NULL /* type de conversation */
);

/* Table pour relier utilisateurs et conversations (association n-n) */
CREATE TABLE utilisateur_conversation (
  utilisateur_id INT NOT NULL,
  conversation_id INT NOT NULL,
  PRIMARY KEY (utilisateur_id, conversation_id),
  FOREIGN KEY (utilisateur_id) 
    REFERENCES utilisateur(utilisateur_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  FOREIGN KEY (conversation_id) 
    REFERENCES conversation(conversation_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

/* Table des messages */
CREATE TABLE message (
  message_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  contenu VARCHAR(500), /* contenu texte du message */
  type ENUM('texte', 'media') NOT NULL, /* type de message */
  horodatage DATETIME NOT NULL, /* date et heure d'envoi */
  fk_utilisateur_id INT, /* utilisateur qui a envoyé le message */
  fk_conversation_id INT, /* conversation où le message est envoyé */
  FOREIGN KEY (fk_utilisateur_id) 
    REFERENCES utilisateur(utilisateur_id)
    ON DELETE SET NULL
    ON UPDATE CASCADE,
  FOREIGN KEY (fk_conversation_id) 
    REFERENCES conversation(conversation_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

/* Table des médias */
CREATE TABLE media (
  media_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  lien VARCHAR(500), /* lien vers le fichier (par ex. Firebase) */
  fk_message_id INT NOT NULL,
  FOREIGN KEY (fk_message_id) 
    REFERENCES message(message_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);
