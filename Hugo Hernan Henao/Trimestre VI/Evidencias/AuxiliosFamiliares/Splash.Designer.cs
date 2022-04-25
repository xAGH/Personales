
namespace AuxiliosFamiliares
{
    partial class SplashWindow
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(SplashWindow));
            this.labelTitle = new System.Windows.Forms.Label();
            this.timerTitle = new System.Windows.Forms.Timer(this.components);
            this.progressBarLoading = new System.Windows.Forms.ProgressBar();
            this.SuspendLayout();
            // 
            // labelTitle
            // 
            this.labelTitle.Dock = System.Windows.Forms.DockStyle.Top;
            this.labelTitle.Font = new System.Drawing.Font("Segoe UI", 48F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelTitle.Location = new System.Drawing.Point(0, 0);
            this.labelTitle.Name = "labelTitle";
            this.labelTitle.Size = new System.Drawing.Size(575, 115);
            this.labelTitle.TabIndex = 0;
            this.labelTitle.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            // 
            // timerTitle
            // 
            this.timerTitle.Enabled = true;
            this.timerTitle.Tick += new System.EventHandler(this.timerTitle_Tick);
            // 
            // progressBarLoading
            // 
            this.progressBarLoading.Location = new System.Drawing.Point(15, 183);
            this.progressBarLoading.Maximum = 11;
            this.progressBarLoading.Name = "progressBarLoading";
            this.progressBarLoading.Size = new System.Drawing.Size(548, 37);
            this.progressBarLoading.Step = 1;
            this.progressBarLoading.TabIndex = 1;
            // 
            // SplashWindow
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(236)))), ((int)(((byte)(233)))), ((int)(((byte)(217)))));
            this.ClientSize = new System.Drawing.Size(575, 256);
            this.Controls.Add(this.progressBarLoading);
            this.Controls.Add(this.labelTitle);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "SplashWindow";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Form1";
            this.ResumeLayout(false);

        }

        #endregion
        private System.Windows.Forms.Label labelTitle;
        private System.Windows.Forms.Timer timerTitle;
        private System.Windows.Forms.ProgressBar progressBarLoading;
    }
}