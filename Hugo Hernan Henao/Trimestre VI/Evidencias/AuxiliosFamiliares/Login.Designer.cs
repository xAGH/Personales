
using System.Drawing;

namespace AuxiliosFamiliares
{
    partial class LoginWindow
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(LoginWindow));
            this.pictureBoxIcon = new System.Windows.Forms.PictureBox();
            this.labelName = new System.Windows.Forms.Label();
            this.labelPassword = new System.Windows.Forms.Label();
            this.textBoxName = new System.Windows.Forms.TextBox();
            this.textBoxPassword = new System.Windows.Forms.TextBox();
            this.buttonExit = new System.Windows.Forms.Button();
            this.buttonLogin = new System.Windows.Forms.Button();
            this.buttonViewPass = new System.Windows.Forms.Button();
            this.timerFails = new System.Windows.Forms.Timer(this.components);
            this.labelTimeToResetFails = new System.Windows.Forms.Label();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBoxIcon)).BeginInit();
            this.SuspendLayout();
            // 
            // pictureBoxIcon
            // 
            this.pictureBoxIcon.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.pictureBoxIcon.Image = ((System.Drawing.Image)(resources.GetObject("pictureBoxIcon.Image")));
            this.pictureBoxIcon.Location = new System.Drawing.Point(38, 34);
            this.pictureBoxIcon.Name = "pictureBoxIcon";
            this.pictureBoxIcon.Size = new System.Drawing.Size(124, 128);
            this.pictureBoxIcon.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pictureBoxIcon.TabIndex = 0;
            this.pictureBoxIcon.TabStop = false;
            // 
            // labelName
            // 
            this.labelName.AutoSize = true;
            this.labelName.Font = new System.Drawing.Font("Segoe UI", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelName.Location = new System.Drawing.Point(197, 57);
            this.labelName.Name = "labelName";
            this.labelName.Size = new System.Drawing.Size(71, 21);
            this.labelName.TabIndex = 1;
            this.labelName.Text = "Nombre:";
            // 
            // labelPassword
            // 
            this.labelPassword.AutoSize = true;
            this.labelPassword.Font = new System.Drawing.Font("Segoe UI", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelPassword.Location = new System.Drawing.Point(199, 112);
            this.labelPassword.Name = "labelPassword";
            this.labelPassword.Size = new System.Drawing.Size(92, 21);
            this.labelPassword.TabIndex = 2;
            this.labelPassword.Text = "Contraseña:";
            // 
            // textBoxName
            // 
            this.textBoxName.Font = new System.Drawing.Font("Segoe UI", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textBoxName.Location = new System.Drawing.Point(297, 54);
            this.textBoxName.Name = "textBoxName";
            this.textBoxName.Size = new System.Drawing.Size(349, 29);
            this.textBoxName.TabIndex = 3;
            this.textBoxName.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.Enter_KeyPress);
            // 
            // textBoxPassword
            // 
            this.textBoxPassword.Font = new System.Drawing.Font("Segoe UI", 12F);
            this.textBoxPassword.Location = new System.Drawing.Point(297, 109);
            this.textBoxPassword.Name = "textBoxPassword";
            this.textBoxPassword.PasswordChar = '*';
            this.textBoxPassword.Size = new System.Drawing.Size(258, 29);
            this.textBoxPassword.TabIndex = 4;
            this.textBoxPassword.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.Enter_KeyPress);
            // 
            // buttonExit
            // 
            this.buttonExit.AutoSize = true;
            this.buttonExit.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(192)))), ((int)(((byte)(192)))));
            this.buttonExit.Cursor = System.Windows.Forms.Cursors.Hand;
            this.buttonExit.FlatAppearance.BorderSize = 0;
            this.buttonExit.FlatAppearance.MouseDownBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.buttonExit.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.buttonExit.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.buttonExit.Font = new System.Drawing.Font("Segoe UI", 12F);
            this.buttonExit.Location = new System.Drawing.Point(12, 185);
            this.buttonExit.Name = "buttonExit";
            this.buttonExit.Size = new System.Drawing.Size(76, 33);
            this.buttonExit.TabIndex = 6;
            this.buttonExit.Text = "&Salir";
            this.buttonExit.UseVisualStyleBackColor = false;
            this.buttonExit.Click += new System.EventHandler(this.ButtonExit_Click);
            // 
            // buttonLogin
            // 
            this.buttonLogin.AutoSize = true;
            this.buttonLogin.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(255)))), ((int)(((byte)(192)))));
            this.buttonLogin.Cursor = System.Windows.Forms.Cursors.Hand;
            this.buttonLogin.FlatAppearance.BorderSize = 0;
            this.buttonLogin.FlatAppearance.MouseDownBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(128)))), ((int)(((byte)(255)))), ((int)(((byte)(128)))));
            this.buttonLogin.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(128)))), ((int)(((byte)(255)))), ((int)(((byte)(128)))));
            this.buttonLogin.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.buttonLogin.Font = new System.Drawing.Font("Segoe UI", 12F);
            this.buttonLogin.Location = new System.Drawing.Point(555, 185);
            this.buttonLogin.Name = "buttonLogin";
            this.buttonLogin.Size = new System.Drawing.Size(91, 33);
            this.buttonLogin.TabIndex = 7;
            this.buttonLogin.Text = "&Continuar";
            this.buttonLogin.UseVisualStyleBackColor = false;
            this.buttonLogin.Click += new System.EventHandler(this.ButtonLogin_Click);
            // 
            // buttonViewPass
            // 
            this.buttonViewPass.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(234)))), ((int)(((byte)(234)))), ((int)(((byte)(234)))));
            this.buttonViewPass.FlatAppearance.BorderSize = 0;
            this.buttonViewPass.FlatAppearance.MouseDownBackColor = System.Drawing.Color.WhiteSmoke;
            this.buttonViewPass.FlatAppearance.MouseOverBackColor = System.Drawing.Color.WhiteSmoke;
            this.buttonViewPass.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.buttonViewPass.Font = new System.Drawing.Font("Segoe UI", 12F);
            this.buttonViewPass.Location = new System.Drawing.Point(561, 109);
            this.buttonViewPass.Name = "buttonViewPass";
            this.buttonViewPass.Size = new System.Drawing.Size(85, 29);
            this.buttonViewPass.TabIndex = 8;
            this.buttonViewPass.Text = "&Ver";
            this.buttonViewPass.UseVisualStyleBackColor = false;
            this.buttonViewPass.Click += new System.EventHandler(this.ButtonViewPass_Click);
            // 
            // timerFails
            // 
            this.timerFails.Interval = 1000;
            this.timerFails.Tick += new System.EventHandler(this.ResetFails);
            // 
            // labelTimeToResetFails
            // 
            this.labelTimeToResetFails.AutoSize = true;
            this.labelTimeToResetFails.Font = new System.Drawing.Font("Segoe UI", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelTimeToResetFails.Location = new System.Drawing.Point(387, 164);
            this.labelTimeToResetFails.Name = "labelTimeToResetFails";
            this.labelTimeToResetFails.Size = new System.Drawing.Size(19, 21);
            this.labelTimeToResetFails.TabIndex = 9;
            this.labelTimeToResetFails.Text = "0";
            this.labelTimeToResetFails.Visible = false;
            // 
            // LoginWindow
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(236)))), ((int)(((byte)(233)))), ((int)(((byte)(217)))));
            this.ClientSize = new System.Drawing.Size(658, 230);
            this.Controls.Add(this.labelTimeToResetFails);
            this.Controls.Add(this.buttonViewPass);
            this.Controls.Add(this.buttonLogin);
            this.Controls.Add(this.buttonExit);
            this.Controls.Add(this.textBoxPassword);
            this.Controls.Add(this.textBoxName);
            this.Controls.Add(this.labelPassword);
            this.Controls.Add(this.labelName);
            this.Controls.Add(this.pictureBoxIcon);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.Fixed3D;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "LoginWindow";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Login";
            ((System.ComponentModel.ISupportInitialize)(this.pictureBoxIcon)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.PictureBox pictureBoxIcon;
        private System.Windows.Forms.Label labelName;
        private System.Windows.Forms.Label labelPassword;
        private System.Windows.Forms.TextBox textBoxName;
        private System.Windows.Forms.TextBox textBoxPassword;
        private System.Windows.Forms.Button buttonExit;
        private System.Windows.Forms.Button buttonLogin;
        private System.Windows.Forms.Button buttonViewPass;
        private System.Windows.Forms.Timer timerFails;
        private System.Windows.Forms.Label labelTimeToResetFails;
    }
}

