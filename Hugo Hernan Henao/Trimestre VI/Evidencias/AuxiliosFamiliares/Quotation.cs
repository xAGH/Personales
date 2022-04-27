using System;
using System.Windows.Forms;

namespace AuxiliosFamiliares
{
    public partial class QuotationWindow : Form
    {

        public QuotationWindow()
        {
            InitializeComponent();
        }

        private void CheckBoxGreeting_CheckedChanged(object sender, EventArgs e)
        {
            groupBoxGender.Visible = checkBoxGreeting.Checked;
        }

        private void TextBox_TextChanged(object sender, EventArgs e)
        {
            if (textBoxName.Text.Length > 0 && textBoxSalary.Text.Length > 0) buttonCalculate.Enabled = true;

            else buttonCalculate.Enabled = false;
        }

        private void ButtonExit_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void ButtonNew_Click(object sender, EventArgs e)
        {
            Clear();
        }

        private void Clear()
        {
            textBoxName.Clear();
            textBoxSalary.Clear();
            numericUpDownSons.Value = 0;
            checkBoxSyndicateMember.Checked = false;
            checkBoxGreeting.Checked = false;
            radioButtonFemenine.Checked = false;
            radioButtonMasculine.Checked = false;
            radioButtonTrans.Checked = false;
            labelResult.Text = "";
        }

        private void TextBoxSalary_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!char.IsControl(e.KeyChar) && !char.IsDigit(e.KeyChar) && (e.KeyChar != '.'))
            {
                e.Handled = true;
            }

            else if (e.KeyChar == 13) buttonCalculate.PerformClick();
        }

        private void CheckBoxSyndicateMember_CheckedChanged(object sender, EventArgs e)
        {
            if (checkBoxSyndicateMember.Checked) checkBoxSyndicateMember.Text = "Es miembro del sindicato";

            else checkBoxSyndicateMember.Text = "No es miembro del sindicato";
        }


        private void Enter_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (e.KeyChar == 13)
            {
                try
                {
                    if ((TextBox)sender == textBoxName) numericUpDownSons.Focus();
                }
                catch
                {
                    textBoxSalary.Focus();
                }
            }
        }

        private string GreetingGender()
        {
            string gender = "";

            if (radioButtonFemenine.Checked) gender = "Sra. ";

            else if (radioButtonMasculine.Checked) gender = "Sr. ";

            else if (radioButtonTrans.Checked) gender = "Hola ";

            return gender;
        }

        private string MessageMaker(Employee employee)
        {
            string total = (employee.Subsidy + employee.BaseSalary).ToString("C");
            string subsidy = employee.Subsidy.ToString("C");
            string salary = employee.BaseSalary.ToString("C");
            string message = String.Format("{0}{1} el subsidio familiar que se la ha otrogado es:\r\n", employee.Pronoun, employee.Name);
            message += String.Format("Salario básico: {0}\r\nHijos registrados: {1}\r\n", salary, employee.Sons);
            message += String.Format("Subsidio: {0}\r\nTotal: {1}", subsidy, total);
            return message;
        }

        private void ButtonCalculate_Click(object sender, EventArgs e)
        {
            ShowMessage();
        }

        private void ShowMessage()
        {
            Employee employee = new Employee();
            employee.Name = textBoxName.Text.ToString();
            employee.BaseSalary = Decimal.Parse(textBoxSalary.Text.ToString());
            employee.Sons = int.Parse(numericUpDownSons.Value.ToString());
            employee.Pronoun = GreetingGender();
            employee.Subsidy = Payroll.Liquidation(employee.Sons, employee.BaseSalary);
            labelResult.Text = MessageMaker(employee);
        }

        private void ToolStripMenu_Click(object sender, EventArgs e)
        {
            if (sender as ToolStripItem == toolStripMenuCalculate)
            {
                if (buttonCalculate.Enabled) ShowMessage();

                else MessageBox.Show("Por favor rellene el nombre y el salario.", "Error");
            }
            else if (sender as ToolStripItem == toolStripNew) Clear();
        }
    }
}
