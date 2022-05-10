using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Cotizaciones
{
    public partial class CotizacionesForm : Form
    {
        public CotizacionesForm()
        {
            InitializeComponent();
        }
        private void TextBox_Enter(object sender, EventArgs e)
        {
            ((TextBox)sender).BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(244)))), ((int)(((byte)(244)))), ((int)(((byte)(244)))));
        }

        private void TextBox_Leave(object sender, EventArgs e)
        {
            ((TextBox)sender).BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(254)))), ((int)(((byte)(254)))), ((int)(((byte)(254)))));
        }

        private void RadioButton_CheckedChanged(object sender, EventArgs e)
        {
            try
            {
                Valor = float.Parse(ValorTextBox.Text);
            }
            catch
            {
                Valor = 0;
            }
            if (BasicoRadioButton.Checked)
            {
                Valor -= MontoAnteriorRB;
                Valor += 50000;
                MontoAnteriorRB = 50000;
                Seguro = "Básico";
            } 
            else if (TercerosRadioButton.Checked)
            {
                Valor -= MontoAnteriorRB;
                Valor += 250000;
                MontoAnteriorRB = 250000;
                Seguro = "Terceros";
            } 
            else if (TotalRadioButton.Checked)
            {
                Valor -= MontoAnteriorRB;
                Valor += 350000;
                MontoAnteriorRB = 350000;
                Seguro = "Total";
            }
            else if (NingunoRadioButton.Checked)
            {
                Valor -= MontoAnteriorRB;
                MontoAnteriorRB = 0;
                Seguro = "No aplica";
            }
            ValorTextBox.Text = Valor + "";
            Validar_Entradas();
        }

        private void Validar_Entradas()
        {
            bool Valido = false;
            if (this.NombreTextBox.Text.Length > 1)
            {
                try
                {
                    if (float.Parse(ValorTextBox.Text) >= 1000)
                    {
                        Valido = true;
                    }
                }
                catch { }   
            }
            if (Valido)
            {
                CotizarButton.Enabled = true;
                CotizarButton.BackColor = System.Drawing.Color.GreenYellow;
            }
            else
            {
                CotizarButton.BackColor = System.Drawing.Color.Honeydew;
                CotizarButton.Enabled = false;
            }
        }
        private void TextBox_Changed(object sender, EventArgs e)
        {
            try
            {
                Valor = float.Parse(ValorTextBox.Text);
            }
            catch
            {
                Valor = 0;
            }
            Validar_Entradas();
        }

        private void SalirButton_MouseClick(object sender, MouseEventArgs e)
        {
            Application.Exit();
        }

        private void AireAcondicionadoCheckBox_CheckedChange(object sender, EventArgs e)
        {
            try
            {
                Valor = float.Parse(ValorTextBox.Text);
            }
            catch
            {
                Valor = 0;
            }
            if (AireAcondicionadoCheckBox.Checked)
            {
                Valor += 120000;
                EquipamientoAire = "Si";
            }
            else if (!AireAcondicionadoCheckBox.Checked)
            {
                Valor -= 120000;
                EquipamientoAire = "No";
            }
            ValorTextBox.Text = Valor + "";
        }

        private void AudioCheckBox_CheckedChange(object sender, EventArgs e)
        {
            try
            {
                Valor = float.Parse(ValorTextBox.Text);
            }
            catch
            {
                Valor = 0;
            }
            if (AudioCheckBox.Checked)
            {
                Valor += 80000;
                EquipamientoAudio = "Si";
            }
            else if (!AudioCheckBox.Checked)
            {
                Valor -= 80000;
                EquipamientoAudio = "No";
            }
            ValorTextBox.Text = Valor + "";
        }

        private void CotizarButton_MouseClick(object sender, MouseEventArgs e)
        {
            string Nombre = NombreTextBox.Text;
            string Mensaje = String.Format("Estimado {0}.{1}Le presentamos la cotización que acaba de realizar.{1}", Nombre, Environment.NewLine);
            Mensaje += String.Format("Seguro: {0}.{3}Aire Acondicionado: {1}.{3}Audio: {2}.{3}", Seguro, EquipamientoAire, EquipamientoAudio, Environment.NewLine);
            Mensaje += String.Format("Valor Total: {0}.", Valor.ToString("C", CultureInfo.CurrentCulture));
            ResultadoTextBox.Text = Mensaje;
        }

        private string Seguro = "No aplica";
        private string EquipamientoAire = "No";
        private string EquipamientoAudio = "No";
        private float Valor;
        private float MontoAnteriorRB = 0; // Monto anterior del radio button.
    }
}
